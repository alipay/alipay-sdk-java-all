package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员阿里云权益兑换接口
 *
 * @author auto create
 * @since 1.0, 2019-04-26 20:07:28
 */
public class AlipayUserAliyunbenefitReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 7193351315842222384L;

	/**
	 * 格式为yyyy-MM-dd HH:mm:ss ，业务操作时间用于对账，不传则以调用请求的当前时间计算
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 阿里云商品Id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 外部业务号码，即调用方的业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 兑换策略，用于标识当前兑换是纯积分兑换还是积分+钱兑换
	 */
	@ApiField("price_strategy")
	private String priceStrategy;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 校验的积分数量，此积分数用于在兑换权益时，校验用户页面看到的积分数量和实际扣减时决策的积分数量是否一致，如果不一致，则不允许下单
	 */
	@ApiField("verify_point")
	private Long verifyPoint;

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPriceStrategy() {
		return this.priceStrategy;
	}
	public void setPriceStrategy(String priceStrategy) {
		this.priceStrategy = priceStrategy;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getVerifyPoint() {
		return this.verifyPoint;
	}
	public void setVerifyPoint(Long verifyPoint) {
		this.verifyPoint = verifyPoint;
	}

}
