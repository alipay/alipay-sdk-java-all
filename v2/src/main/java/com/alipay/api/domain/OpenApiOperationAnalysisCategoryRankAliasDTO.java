package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析-商品分析-品类排行返回结构体
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:50:03
 */
public class OpenApiOperationAnalysisCategoryRankAliasDTO extends AlipayObject {

	private static final long serialVersionUID = 3553531841342194252L;

	/**
	 * 小程序应用ID，分配给开发者的应用ID
	 */
	@ApiField("alipay_app_id")
	private String alipayAppId;

	/**
	 * 小程序应用名称，开发者的应用设置的小程序应用名称
	 */
	@ApiField("alipay_app_name")
	private String alipayAppName;

	/**
	 * 品类ID
	 */
	@ApiField("cate_id")
	private String cateId;

	/**
	 * 品类名称
	 */
	@ApiField("cate_name")
	private String cateName;

	/**
	 * 支付金额，单位：元
	 */
	@ApiField("cate_traded_amt")
	private OperationValueBaseDTO cateTradedAmt;

	/**
	 * 退款金额，单位：元
	 */
	@ApiField("cate_traded_refund_amt")
	private OperationValueBaseDTO cateTradedRefundAmt;

	/**
	 * 商品售量(支付件数)、销量
	 */
	@ApiField("cate_traded_sales_cnt")
	private OperationValueLongDTO cateTradedSalesCnt;

	/**
	 * 访问人数
	 */
	@ApiField("cate_uv")
	private OperationValueLongDTO cateUv;

	/**
	 * 数据平台类型，数据上报的平台类型，枚举值所有情况请查看入参的该字段说明
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 业务的数据日期
	 */
	@ApiField("dt")
	private String dt;

	/**
	 * 多端小程序应用ID，非支付宝平台的其他平台的小程序应用ID
	 */
	@ApiField("multi_app_id")
	private String multiAppId;

	/**
	 * 多端小程序应用名称，非支付宝平台的小程序应用名称
	 */
	@ApiField("multi_app_name")
	private String multiAppName;

	public String getAlipayAppId() {
		return this.alipayAppId;
	}
	public void setAlipayAppId(String alipayAppId) {
		this.alipayAppId = alipayAppId;
	}

	public String getAlipayAppName() {
		return this.alipayAppName;
	}
	public void setAlipayAppName(String alipayAppName) {
		this.alipayAppName = alipayAppName;
	}

	public String getCateId() {
		return this.cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	public String getCateName() {
		return this.cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public OperationValueBaseDTO getCateTradedAmt() {
		return this.cateTradedAmt;
	}
	public void setCateTradedAmt(OperationValueBaseDTO cateTradedAmt) {
		this.cateTradedAmt = cateTradedAmt;
	}

	public OperationValueBaseDTO getCateTradedRefundAmt() {
		return this.cateTradedRefundAmt;
	}
	public void setCateTradedRefundAmt(OperationValueBaseDTO cateTradedRefundAmt) {
		this.cateTradedRefundAmt = cateTradedRefundAmt;
	}

	public OperationValueLongDTO getCateTradedSalesCnt() {
		return this.cateTradedSalesCnt;
	}
	public void setCateTradedSalesCnt(OperationValueLongDTO cateTradedSalesCnt) {
		this.cateTradedSalesCnt = cateTradedSalesCnt;
	}

	public OperationValueLongDTO getCateUv() {
		return this.cateUv;
	}
	public void setCateUv(OperationValueLongDTO cateUv) {
		this.cateUv = cateUv;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getDt() {
		return this.dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getMultiAppId() {
		return this.multiAppId;
	}
	public void setMultiAppId(String multiAppId) {
		this.multiAppId = multiAppId;
	}

	public String getMultiAppName() {
		return this.multiAppName;
	}
	public void setMultiAppName(String multiAppName) {
		this.multiAppName = multiAppName;
	}

}
