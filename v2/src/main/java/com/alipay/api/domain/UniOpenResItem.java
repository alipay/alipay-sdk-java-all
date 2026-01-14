package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聚合开通结果项
 *
 * @author auto create
 * @since 1.0, 2025-11-17 21:36:42
 */
public class UniOpenResItem extends AlipayObject {

	private static final long serialVersionUID = 4311263736132441387L;

	/**
	 * 开通项结果详情
	 */
	@ApiField("detail_info")
	private String detailInfo;

	/**
	 * 开通项结果详情（废弃）
	 */
	@ApiField("detail_infos")
	private UniOpenResItemDetailInfos detailInfos;

	/**
	 * 原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 开通类型
	 */
	@ApiField("open_type")
	private String openType;

	/**
	 * 注：在异步通知中，只会存在明确结果的状态：SUCCESS、FAIL或RETRY
	 */
	@ApiField("status")
	private String status;

	public String getDetailInfo() {
		return this.detailInfo;
	}
	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}

	public UniOpenResItemDetailInfos getDetailInfos() {
		return this.detailInfos;
	}
	public void setDetailInfos(UniOpenResItemDetailInfos detailInfos) {
		this.detailInfos = detailInfos;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getOpenType() {
		return this.openType;
	}
	public void setOpenType(String openType) {
		this.openType = openType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
