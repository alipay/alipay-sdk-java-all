package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户库切换
 *
 * @author auto create
 * @since 1.0, 2024-10-24 11:34:24
 */
public class AlipayOpenIotvspUsergroupengineTransferModel extends AlipayObject {

	private static final long serialVersionUID = 8376631693698642119L;

	/**
	 * 业务流水id,便于问题排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 服务商pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 签约主体外标id
	 */
	@ApiField("org_out_id")
	private String orgOutId;

	/**
	 * 用户刷脸标识集合
	 */
	@ApiListField("vid_list")
	@ApiField("string")
	private List<String> vidList;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getOrgOutId() {
		return this.orgOutId;
	}
	public void setOrgOutId(String orgOutId) {
		this.orgOutId = orgOutId;
	}

	public List<String> getVidList() {
		return this.vidList;
	}
	public void setVidList(List<String> vidList) {
		this.vidList = vidList;
	}

}
