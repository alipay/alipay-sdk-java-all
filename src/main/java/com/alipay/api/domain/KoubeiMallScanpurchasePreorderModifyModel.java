package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预订单修改
 *
 * @author auto create
 * @since 1.0, 2019-01-18 15:02:43
 */
public class KoubeiMallScanpurchasePreorderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8577559466693857197L;

	/**
	 * 预订单编号
	 */
	@ApiField("advance_order_id")
	private String advanceOrderId;

	/**
	 * 订单描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 订单包含的商品列表信息，json格式，其它说明详见商品明细说明
	 */
	@ApiListField("goods_detail")
	@ApiField("mall_goods_detail")
	private List<MallGoodsDetail> goodsDetail;

	/**
	 * 商户操作员（业务员）编号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单未优惠的总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。如果商品信息修改了，则该值必须要传。（重新计算商品总原价）
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getAdvanceOrderId() {
		return this.advanceOrderId;
	}
	public void setAdvanceOrderId(String advanceOrderId) {
		this.advanceOrderId = advanceOrderId;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public List<MallGoodsDetail> getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(List<MallGoodsDetail> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
