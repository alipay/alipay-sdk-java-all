package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 聚合开通项请求详情
 *
 * @author auto create
 * @since 1.0, 2025-11-05 17:00:06
 */
public class UniOpenReqItem extends AlipayObject {

	private static final long serialVersionUID = 1521484845741436911L;

	/**
	 * 聚合开通详情
	 */
	@ApiField("detail_infos")
	private UniOpenReqItemDetailInfos detailInfos;

	/**
	 * 开通类型
	 */
	@ApiField("open_type")
	private String openType;

	public UniOpenReqItemDetailInfos getDetailInfos() {
		return this.detailInfos;
	}
	public void setDetailInfos(UniOpenReqItemDetailInfos detailInfos) {
		this.detailInfos = detailInfos;
	}

	public String getOpenType() {
		return this.openType;
	}
	public void setOpenType(String openType) {
		this.openType = openType;
	}

}
