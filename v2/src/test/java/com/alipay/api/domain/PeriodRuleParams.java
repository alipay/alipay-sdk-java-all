package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期扣款规则参数。使用周期扣款产品时需要传入，限定了发起扣款的周期、金额等。
 *
 * @author auto create
 * @since 1.0, 2019-06-05 15:07:29
 */
public class PeriodRuleParams extends AlipayObject {

    private static final long serialVersionUID = 6712597633381943449L;

    /**
     * 首次执行时间execute_time是周期扣款产品必填，即商户发起首次扣款的时间。精确到日，格式为yyyy-MM-dd 结合其他必填的扣款周期参数，会确定商户以后的扣款计划。发起扣款的时间需符合这里的扣款计划。
     */
    @ApiField("execute_time")
    private String executeTime;

    /**
     * 周期数period是周期扣款产品必填。与另一参数period_type组合使用确定扣款周期，例如period_type为DAY，period=90，则扣款周期为90天。
     */
    @ApiField("period")
    private Long period;

    /**
     * 周期类型period_type是周期扣款产品必填，枚举值为DAY和MONTH。 DAY即扣款周期按天计，MONTH代表扣款周期按自然月。
     * 与另一参数period组合使用确定扣款周期，例如period_type为DAY，period=30，则扣款周期为30天；period_type为MONTH，period=3，则扣款周期为3个自然月。
     * 自然月是指，不论这个月有多少天，周期都计算到月份中的同一日期。例如1月3日到2月3日为一个自然月，1月3日到4月3日为三个自然月。注意周期类型使用MONTH的时候，计划扣款时间execute_time不允许传28日之后的日期（可以传28
     * 日），以此避免有些月份可能不存在对应日期的情况。
     */
    @ApiField("period_type")
    private String periodType;

    /**
     * 单次扣款最大金额single_amount是周期扣款产品必填，即每次发起扣款时限制的最大金额，单位为元。商户每次发起扣款都不允许大于此金额。
     */
    @ApiField("single_amount")
    private String singleAmount;

    /**
     * 总金额限制，单位为元。如果传入此参数，商户多次扣款的累计金额不允许超过此金额。
     */
    @ApiField("total_amount")
    private String totalAmount;

    /**
     * 总扣款次数。如果传入此参数，则商户成功扣款的次数不能超过此次数限制（扣款失败不计入）。
     */
    @ApiField("total_payments")
    private Long totalPayments;

    public String getExecuteTime() {
        return this.executeTime;
    }

    public void setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
    }

    public Long getPeriod() {
        return this.period;
    }

    public void setPeriod(Long period) {
        this.period = period;
    }

    public String getPeriodType() {
        return this.periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public String getSingleAmount() {
        return this.singleAmount;
    }

    public void setSingleAmount(String singleAmount) {
        this.singleAmount = singleAmount;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getTotalPayments() {
        return this.totalPayments;
    }

    public void setTotalPayments(Long totalPayments) {
        this.totalPayments = totalPayments;
    }
}
