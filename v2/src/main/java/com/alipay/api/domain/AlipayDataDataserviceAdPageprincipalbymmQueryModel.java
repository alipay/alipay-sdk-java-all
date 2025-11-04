package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 妈妈查询商家信息接口
 *
 * @author auto create
 * @since 1.0, 2025-05-13 16:45:46
 */
public class AlipayDataDataserviceAdPageprincipalbymmQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8677664324741338394L;

	/**
	 * 登录用户支付宝统一ID,2088开头字符串。登录校验和可反查出user_id。
	 */
	@ApiField("alipay_oid")
	private String alipayOid;

	/**
	 * 权限token,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 当前页码
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 账户名称、账号、商户号模糊匹配
	 */
	@ApiField("key_word")
	private String keyWord;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 委托人状态
	 */
	@ApiField("status")
	private String status;

	public String getAlipayOid() {
		return this.alipayOid;
	}
	public void setAlipayOid(String alipayOid) {
		this.alipayOid = alipayOid;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public Long getCurrent() {
		return this.current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}

	public String getKeyWord() {
		return this.keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
