package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝建群
 *
 * @author auto create
 * @since 1.0, 2016-08-25 10:46:34
 */
public class AlipaySocialBaseGroupCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1585615949837679993L;

	/**
	 * 业务方传入的唯一id，做为幂等使用
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 群的业务类型，目前只能为0
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 建群时初始化的群设置
	 */
	@ApiField("group_settings")
	private GroupSetting groupSettings;

	/**
	 * 建群的时候，群主的userid
	 */
	@ApiField("master_id")
	private String masterId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public GroupSetting getGroupSettings() {
		return this.groupSettings;
	}
	public void setGroupSettings(GroupSetting groupSettings) {
		this.groupSettings = groupSettings;
	}

	public String getMasterId() {
		return this.masterId;
	}
	public void setMasterId(String masterId) {
		this.masterId = masterId;
	}

}
