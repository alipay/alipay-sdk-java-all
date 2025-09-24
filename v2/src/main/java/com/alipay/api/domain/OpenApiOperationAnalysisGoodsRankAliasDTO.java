package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OpenApiOperationAnalysisGoodsRankDTO
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:50:01
 */
public class OpenApiOperationAnalysisGoodsRankAliasDTO extends AlipayObject {

	private static final long serialVersionUID = 5769797237969756719L;

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
	 * 品类ID，查询品类指标趋势数据的主要依据
	 */
	@ApiField("cate_id")
	private String cateId;

	/**
	 * 商品品类的名称
	 */
	@ApiField("cate_name")
	private String cateName;

	/**
	 * 数据平台类型，数据上报的平台类型枚举，所有枚举值请查看该字段入参的描述.
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

	/**
	 * 商品ID，查询品类指标趋势数据的主要依据
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 商品的名称
	 */
	@ApiField("spu_name")
	private String spuName;

	/**
	 * 支付金额，单位：元
	 */
	@ApiField("spu_traded_amt")
	private OperationValueBaseDTO spuTradedAmt;

	/**
	 * 退款金额， 单位：元
	 */
	@ApiField("spu_traded_refund_amt")
	private OperationValueBaseDTO spuTradedRefundAmt;

	/**
	 * 商品售量(支付件数)、销量
	 */
	@ApiField("spu_traded_sales_cnt")
	private OperationValueLongDTO spuTradedSalesCnt;

	/**
	 * 访问人数
	 */
	@ApiField("spu_uv")
	private OperationValueLongDTO spuUv;

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

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getSpuName() {
		return this.spuName;
	}
	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}

	public OperationValueBaseDTO getSpuTradedAmt() {
		return this.spuTradedAmt;
	}
	public void setSpuTradedAmt(OperationValueBaseDTO spuTradedAmt) {
		this.spuTradedAmt = spuTradedAmt;
	}

	public OperationValueBaseDTO getSpuTradedRefundAmt() {
		return this.spuTradedRefundAmt;
	}
	public void setSpuTradedRefundAmt(OperationValueBaseDTO spuTradedRefundAmt) {
		this.spuTradedRefundAmt = spuTradedRefundAmt;
	}

	public OperationValueLongDTO getSpuTradedSalesCnt() {
		return this.spuTradedSalesCnt;
	}
	public void setSpuTradedSalesCnt(OperationValueLongDTO spuTradedSalesCnt) {
		this.spuTradedSalesCnt = spuTradedSalesCnt;
	}

	public OperationValueLongDTO getSpuUv() {
		return this.spuUv;
	}
	public void setSpuUv(OperationValueLongDTO spuUv) {
		this.spuUv = spuUv;
	}

}
