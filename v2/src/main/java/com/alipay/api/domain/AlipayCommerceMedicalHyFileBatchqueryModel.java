package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 互医批量获取文件信息
 *
 * @author auto create
 * @since 1.0, 2026-08-31 16:07:53
 */
public class AlipayCommerceMedicalHyFileBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3396766738829178614L;

	/**
	 * null
	 */
	@ApiListField("file_list")
	@ApiField("file_item")
	private List<FileItem> fileList;

	/**
	 * 支付宝侧问诊订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 互联网医院平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	public List<FileItem> getFileList() {
		return this.fileList;
	}
	public void setFileList(List<FileItem> fileList) {
		this.fileList = fileList;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

}
