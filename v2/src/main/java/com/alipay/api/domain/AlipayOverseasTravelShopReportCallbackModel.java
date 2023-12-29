package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺上报A+回调
 *
 * @author auto create
 * @since 1.0, 2023-07-13 11:20:49
 */
public class AlipayOverseasTravelShopReportCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 1379881238786461951L;

	/**
	 * 数据版本
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * 外部店铺id
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 店铺上报进度信息
	 */
	@ApiField("progress_info")
	private ShopReportProgressInfo progressInfo;

	/**
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 结果消息
	 */
	@ApiField("result_message")
	private String resultMessage;

	/**
	 * 结果状态
	 */
	@ApiField("result_status")
	private String resultStatus;

	public String getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public ShopReportProgressInfo getProgressInfo() {
		return this.progressInfo;
	}
	public void setProgressInfo(ShopReportProgressInfo progressInfo) {
		this.progressInfo = progressInfo;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultStatus() {
		return this.resultStatus;
	}
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

}
