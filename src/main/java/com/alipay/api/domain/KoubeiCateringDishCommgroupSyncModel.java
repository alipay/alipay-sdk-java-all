package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品通用组管理同步 
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:38:19
 */
public class KoubeiCateringDishCommgroupSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3892964368354115232L;

	/**
	 * group：组信息；detail：明细信息
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 组模型
	 */
	@ApiField("kbdish_comm_group_info")
	private KbdishCommGroupInfo kbdishCommGroupInfo;

	/**
	 * 同步类型: add 新增;update 修改;del 删除
	 */
	@ApiField("syn_type")
	private String synType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public KbdishCommGroupInfo getKbdishCommGroupInfo() {
		return this.kbdishCommGroupInfo;
	}
	public void setKbdishCommGroupInfo(KbdishCommGroupInfo kbdishCommGroupInfo) {
		this.kbdishCommGroupInfo = kbdishCommGroupInfo;
	}

	public String getSynType() {
		return this.synType;
	}
	public void setSynType(String synType) {
		this.synType = synType;
	}

}
