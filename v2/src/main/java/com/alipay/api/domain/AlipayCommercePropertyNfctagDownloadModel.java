package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NFC线圈导出下载接口
 *
 * @author auto create
 * @since 1.0, 2025-08-07 10:37:36
 */
public class AlipayCommercePropertyNfctagDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 5183125866586494391L;

	/**
	 * 业务类型
巡检：PATROL(默认) 
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 宿主小程序id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 项目ID
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 线圈数量
	 */
	@ApiField("count")
	private Long count;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

}
