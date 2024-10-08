package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品账单下载
 *
 * @author auto create
 * @since 1.0, 2024-06-06 19:10:38
 */
public class AlipayOpenMiniOrderOrderbillDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 7876232453535917223L;

	/**
	 * * 日账单格式为yyyy-MM-dd，最早可下载2016年1月1日开始的日账单。不支持下载当日账单，只能下载前一日24点前的账单数据（T+1），当日数据一般于次日 9 点前生成，特殊情况可能延迟。
* 月账单格式为yyyy-MM，最早可下载2016年1月开始的月账单。不支持下载当月账单，只能下载上一月账单数据，当月账单一般在次月 3 日生成，特殊情况可能延迟。
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 账单类型，商户或商户经开放平台授权后其所属服务商通过接口可以获取以下账单类型。
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
