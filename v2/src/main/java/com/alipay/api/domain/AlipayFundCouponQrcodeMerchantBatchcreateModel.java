package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量创建喜气红包产品二维码
 *
 * @author auto create
 * @since 1.0, 2023-07-27 11:33:52
 */
public class AlipayFundCouponQrcodeMerchantBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 5118715479673133365L;

	/**
	 * 生成的码关联的产品，喜气红包场景填CROWD_CELEBRATE_CASH
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 每组码的个数，每组码最多600个
	 */
	@ApiField("code_count")
	private String codeCount;

	/**
	 * 每批需要生成的码组的数量
	 */
	@ApiField("code_group_count")
	private String codeGroupCount;

	/**
	 * 外部业务号，根据这个单据号关联此批次生成的所有二维码
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getCodeCount() {
		return this.codeCount;
	}
	public void setCodeCount(String codeCount) {
		this.codeCount = codeCount;
	}

	public String getCodeGroupCount() {
		return this.codeGroupCount;
	}
	public void setCodeGroupCount(String codeGroupCount) {
		this.codeGroupCount = codeGroupCount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
