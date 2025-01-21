package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务变更信息
 *
 * @author auto create
 * @since 1.0, 2024-06-14 16:37:35
 */
public class JourneyServiceChangeInfo extends AlipayObject {

	private static final long serialVersionUID = 1624862335563259192L;

	/**
	 * 变更状态
	 */
	@ApiField("change_status")
	private String changeStatus;

	/**
	 * 详情url
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 提醒内容
	 */
	@ApiField("remind_content")
	private String remindContent;

	public String getChangeStatus() {
		return this.changeStatus;
	}
	public void setChangeStatus(String changeStatus) {
		this.changeStatus = changeStatus;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getRemindContent() {
		return this.remindContent;
	}
	public void setRemindContent(String remindContent) {
		this.remindContent = remindContent;
	}

}
