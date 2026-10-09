package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店副本详情查询
 *
 * @author auto create
 * @since 1.0, 2026-09-28 15:47:53
 */
public class AlipayCommerceLifeserviceShopcopydetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4791678826476986824L;

	/**
	 * 副本业务ID
	 */
	@ApiField("copy_id")
	private String copyId;

	/**
	 * 商户ID【查询非调用方门店详情必传】
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户ID【查询非调用方门店详情必传】
	 */
	@ApiField("pid")
	private String pid;

	public String getCopyId() {
		return this.copyId;
	}
	public void setCopyId(String copyId) {
		this.copyId = copyId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
