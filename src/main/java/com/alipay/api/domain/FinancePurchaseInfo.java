package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 区块链金融业务的采购内容信息
 *
 * @author auto create
 * @since 1.0, 2020-02-18 09:19:19
 */
public class FinancePurchaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2632696428687428425L;

	/**
	 * 采购内容描述
	 */
	@ApiField("content")
	private String content;

	/**
	 * 文件信息列表
	 */
	@ApiListField("file_list")
	@ApiField("finance_file_info")
	private List<FinanceFileInfo> fileList;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public List<FinanceFileInfo> getFileList() {
		return this.fileList;
	}
	public void setFileList(List<FinanceFileInfo> fileList) {
		this.fileList = fileList;
	}

}
