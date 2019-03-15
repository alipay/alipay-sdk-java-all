package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代理
 *
 * @author auto create
 * @since 1.0, 2019-03-14 12:36:12
 */
public class AgentOrganization extends AlipayObject {

	private static final long serialVersionUID = 2292735154432144733L;

	/**
	 * 代理机构(ISV)蚂蚁编码，组织入驻蚂蚁生成的cid
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 代理机构(ISV)蚂蚁全称,组织入驻蚂蚂蚁的全称
	 */
	@ApiField("cid_name")
	private String cidName;

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCidName() {
		return this.cidName;
	}
	public void setCidName(String cidName) {
		this.cidName = cidName;
	}

}
