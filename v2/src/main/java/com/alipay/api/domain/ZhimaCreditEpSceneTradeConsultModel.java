package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易评估咨询
 *
 * @author auto create
 * @since 1.0, 2021-10-27 17:13:31
 */
public class ZhimaCreditEpSceneTradeConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6818858893698695391L;

	/**
	 * 信用交易额度，单位为：人民币分，整型；
	 */
	@ApiField("apply_amount")
	private Long applyAmount;

	/**
	 * 业务数据传输扩展参数，以json形式传输。具体行业需要传输的数据参见具体行业的对接文档
	 */
	@ApiField("biz_ext_param")
	private String bizExtParam;

	/**
	 * 客户评估单号
	 */
	@ApiField("customer_rating_no")
	private String customerRatingNo;

	/**
	 * 商户请求的唯一标志，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 产品码，请填写示例值里提供的值
	 */
	@ApiField("product_code")
	private String productCode;

	public Long getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(Long applyAmount) {
		this.applyAmount = applyAmount;
	}

	public String getBizExtParam() {
		return this.bizExtParam;
	}
	public void setBizExtParam(String bizExtParam) {
		this.bizExtParam = bizExtParam;
	}

	public String getCustomerRatingNo() {
		return this.customerRatingNo;
	}
	public void setCustomerRatingNo(String customerRatingNo) {
		this.customerRatingNo = customerRatingNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
