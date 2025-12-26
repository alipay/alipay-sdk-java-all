package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提交预受理时所需要的信息
 *
 * @author auto create
 * @since 1.0, 2025-11-19 10:42:36
 */
public class CarfinPreMortgageInfo extends AlipayObject {

	private static final long serialVersionUID = 7521588842433893783L;

	/**
	 * 审核文件列表
	 */
	@ApiListField("approve_file_list")
	@ApiField("carfin_pre_mortgage_file")
	private List<CarfinPreMortgageFile> approveFileList;

	/**
	 * 办理渠道
1 - 专网
2 - 公安网
	 */
	@ApiField("channel")
	private String channel;

	public List<CarfinPreMortgageFile> getApproveFileList() {
		return this.approveFileList;
	}
	public void setApproveFileList(List<CarfinPreMortgageFile> approveFileList) {
		this.approveFileList = approveFileList;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

}
