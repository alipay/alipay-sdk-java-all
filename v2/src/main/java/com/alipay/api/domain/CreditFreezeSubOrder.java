package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用额度冻结子订单模型
 *
 * @author auto create
 * @since 1.0, 2018-10-10 10:59:39
 */
public class CreditFreezeSubOrder extends AlipayObject {

	private static final long serialVersionUID = 3869537671121517986L;

	/**
	 * 用信冻结额度，单位为元，取值范围[0.01,100000000]，精确到小数点后2位
	 */
	@ApiField("credit_amount")
	private String creditAmount;

	/**
	 * 子订单扩展信息，json格式字符串，该部分信息根据不同业务需要传入不同的内容，需要提前与业务方进行沟通
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 应履约时间(用户应该支付尾款的最后截止时间)，格式必须为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("fulfill_cutoff_time")
	private String fulfillCutoffTime;

	/**
	 * 物品价值，单位为元，取值范围[0.01,100000000]，精确到小数点后2位
	 */
	@ApiField("goods_amount")
	private String goodsAmount;

	/**
	 * 物品名称描述，如：iPhone XS Max，商品原始显示名称，已通过脱敏处理
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商户子订单号，如果只有主订单与子订单为1:1，子订单号可以与主订单号一致
	 */
	@ApiField("sub_out_order_no")
	private String subOutOrderNo;

	public String getCreditAmount() {
		return this.creditAmount;
	}
	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFulfillCutoffTime() {
		return this.fulfillCutoffTime;
	}
	public void setFulfillCutoffTime(String fulfillCutoffTime) {
		this.fulfillCutoffTime = fulfillCutoffTime;
	}

	public String getGoodsAmount() {
		return this.goodsAmount;
	}
	public void setGoodsAmount(String goodsAmount) {
		this.goodsAmount = goodsAmount;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getSubOutOrderNo() {
		return this.subOutOrderNo;
	}
	public void setSubOutOrderNo(String subOutOrderNo) {
		this.subOutOrderNo = subOutOrderNo;
	}

}
