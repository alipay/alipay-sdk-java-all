package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收行业质检报告上传
 *
 * @author auto create
 * @since 1.0, 2025-11-17 15:02:41
 */
public class AlipayCommerceRecycleQcreportUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1288672943267589485L;

	/**
	 * null
	 */
	@ApiListField("check_items")
	@ApiField("recycle_qc_report_check_items")
	private List<RecycleQcReportCheckItems> checkItems;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_no")
	private String merchantNo;

	/**
	 * 商户自有的质检报告地址，需要传支付宝小程序页面url，规范参考<a href="https://opendocs.alipay.com/support/01rb18">文档</a>
	 */
	@ApiField("merchant_report_url")
	private String merchantReportUrl;

	/**
	 * 支付宝用户OPENID
	 */
	@ApiField("openid")
	private String openid;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 产品信息
	 */
	@ApiField("product_info")
	private RecycleQcReportProductInfo productInfo;

	/**
	 * 报告总结
	 */
	@ApiField("summary")
	private RecycleQcReportSummaryInfo summary;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<RecycleQcReportCheckItems> getCheckItems() {
		return this.checkItems;
	}
	public void setCheckItems(List<RecycleQcReportCheckItems> checkItems) {
		this.checkItems = checkItems;
	}

	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getMerchantReportUrl() {
		return this.merchantReportUrl;
	}
	public void setMerchantReportUrl(String merchantReportUrl) {
		this.merchantReportUrl = merchantReportUrl;
	}

	public String getOpenid() {
		return this.openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public RecycleQcReportProductInfo getProductInfo() {
		return this.productInfo;
	}
	public void setProductInfo(RecycleQcReportProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	public RecycleQcReportSummaryInfo getSummary() {
		return this.summary;
	}
	public void setSummary(RecycleQcReportSummaryInfo summary) {
		this.summary = summary;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
