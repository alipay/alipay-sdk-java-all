package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提交抵押预受理的文件信息
 *
 * @author auto create
 * @since 1.0, 2025-11-19 10:42:36
 */
public class CarfinPreMortgageFile extends AlipayObject {

	private static final long serialVersionUID = 2772111134261526635L;

	/**
	 * 文件在支付宝的aftsid
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件类型：
10201 —— 抵押/解除抵押申请表 PDF 文件
10202 ——所有人身份证正反面原件
10215 —— 抵押合同 PDF 文件
10273 —— 抵押权人委托书文件
10258 —— 车主委托书
	 */
	@ApiField("type")
	private String type;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
