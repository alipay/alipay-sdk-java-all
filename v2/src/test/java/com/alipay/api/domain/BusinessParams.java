package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务信息参数
 *
 * @author auto create
 * @since 1.0, 2019-05-16 14:21:54
 */
public class BusinessParams extends AlipayObject {

    private static final long serialVersionUID = 8535536268291989794L;

    /**
     * 实际订单时间，在乘车码场景，传入的是用户刷码乘车时间
     */
    @ApiField("actual_order_time")
    private String actualOrderTime;

    /**
     * 校园卡编号
     */
    @ApiField("campus_card")
    private String campusCard;

    /**
     * 虚拟卡卡类型
     */
    @ApiField("card_type")
    private String cardType;

    public String getActualOrderTime() {
        return this.actualOrderTime;
    }

    public void setActualOrderTime(String actualOrderTime) {
        this.actualOrderTime = actualOrderTime;
    }

    public String getCampusCard() {
        return this.campusCard;
    }

    public void setCampusCard(String campusCard) {
        this.campusCard = campusCard;
    }

    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

}
