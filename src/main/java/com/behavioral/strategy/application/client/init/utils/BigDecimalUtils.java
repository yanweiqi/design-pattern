package com.behavioral.strategy.application.client.init.utils;

import java.math.BigDecimal;

public class BigDecimalUtils {
    public static final BigDecimal ONE_HUNDRED = new BigDecimal(100);

    public BigDecimalUtils() {
    }

    public static boolean isZero(BigDecimal amount) {
        return null == amount?true:amount.compareTo(BigDecimal.ZERO) == 0;
    }

    public static BigDecimal add(BigDecimal... others) {
        if(others == null) {
            return BigDecimal.ZERO;
        } else {
            BigDecimal tempAmount = BigDecimal.ZERO;
            BigDecimal[] arr$ = others;
            int len$ = others.length;

            for(int i$ = 0; i$ < len$; ++i$) {
                BigDecimal single = arr$[i$];
                if(single != null) {
                    tempAmount = tempAmount.add(single);
                }
            }

            return tempAmount;
        }
    }

    public static BigDecimal sub(BigDecimal total, BigDecimal... others) {
        if(others == null) {
            return total;
        } else {
            BigDecimal leftAmount = total;
            BigDecimal[] arr$ = others;
            int len$ = others.length;

            for(int i$ = 0; i$ < len$; ++i$) {
                BigDecimal single = arr$[i$];
                if(single != null) {
                    leftAmount = leftAmount.subtract(single);
                }
            }

            return leftAmount;
        }
    }

    public static BigDecimal divide(BigDecimal left, BigDecimal right){
        return divide(left, right, 6, BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal divide(BigDecimal left, BigDecimal right, int scale, int roundingMode){
//        if(left == null || BigDecimalUtils.isZero(left)){
//            return BigDecimal.ZERO;
//        }
//        if(right == null || BigDecimalUtils.isZero(right)){
//            return BigDecimal.ZERO;
//        }
        return left.divide(right, scale, roundingMode);
    }

    /**
     * 默认保留四位小数
     * @param value
     * @return
     */
    public static double doubleValue(BigDecimal value){
        return doubleValue(value, 4);
    }

    /**
     * bigdecimal 转 double，Scale 保留几位小数
     * @param value
     * @param Scale
     * @return
     */
    public static double doubleValue(BigDecimal value, int Scale){
        if(value == null){
            return 0d;
        }
        return value.setScale(Scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static BigDecimal multiply(BigDecimal left, BigDecimal right){
        return left.multiply(right);
    }


    public static boolean eq(BigDecimal amount, BigDecimal other) {
        return amount.compareTo(other) == 0;
    }

    public static boolean gt(BigDecimal amount, BigDecimal other) {
        return amount.compareTo(other) > 0;
    }

    public static boolean eteq(BigDecimal amount, BigDecimal other) {
        return amount.compareTo(other) >= 0;
    }

    public static boolean lt(BigDecimal amount, BigDecimal other) {
        return amount.compareTo(other) < 0;
    }

    public static boolean lteq(BigDecimal amount, BigDecimal other) {
        return amount.compareTo(other) <= 0;
    }

}
