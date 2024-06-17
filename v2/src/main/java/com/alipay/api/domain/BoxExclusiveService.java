package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * box的服务模型
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:46
 */
public class BoxExclusiveService extends AlipayObject {

	private static final long serialVersionUID = 5572986233638276613L;

	/**
	 * 父服务编码
	 */
	@ApiField("ref_serv_code")
	private String refServCode;

	/**
	 * 父服务名称
	 */
	@ApiField("ref_serv_name")
	private String refServName;

	/**
	 * 父服务类型
	 */
	@ApiField("ref_serv_type")
	private String refServType;

	/**
	 * 服务类目
	 */
	@ApiField("serv_cat")
	private String servCat;

	/**
	 * 服务code
	 */
	@ApiField("serv_code")
	private String servCode;

	/**
	 * 服务描述
	 */
	@ApiField("serv_desc")
	private String servDesc;

	/**
	 * 服务id
	 */
	@ApiField("serv_id")
	private String servId;

	/**
	 * 服务链接
	 */
	@ApiField("serv_link")
	private String servLink;

	/**
	 * 服务logo
	 */
	@ApiField("serv_logo")
	private String servLogo;

	/**
	 * 服务名称
	 */
	@ApiField("serv_name")
	private String servName;

	/**
	 * 服务类型
	 */
	@ApiField("serv_type")
	private String servType;

	public String getRefServCode() {
		return this.refServCode;
	}
	public void setRefServCode(String refServCode) {
		this.refServCode = refServCode;
	}

	public String getRefServName() {
		return this.refServName;
	}
	public void setRefServName(String refServName) {
		this.refServName = refServName;
	}

	public String getRefServType() {
		return this.refServType;
	}
	public void setRefServType(String refServType) {
		this.refServType = refServType;
	}

	public String getServCat() {
		return this.servCat;
	}
	public void setServCat(String servCat) {
		this.servCat = servCat;
	}

	public String getServCode() {
		return this.servCode;
	}
	public void setServCode(String servCode) {
		this.servCode = servCode;
	}

	public String getServDesc() {
		return this.servDesc;
	}
	public void setServDesc(String servDesc) {
		this.servDesc = servDesc;
	}

	public String getServId() {
		return this.servId;
	}
	public void setServId(String servId) {
		this.servId = servId;
	}

	public String getServLink() {
		return this.servLink;
	}
	public void setServLink(String servLink) {
		this.servLink = servLink;
	}

	public String getServLogo() {
		return this.servLogo;
	}
	public void setServLogo(String servLogo) {
		this.servLogo = servLogo;
	}

	public String getServName() {
		return this.servName;
	}
	public void setServName(String servName) {
		this.servName = servName;
	}

	public String getServType() {
		return this.servType;
	}
	public void setServType(String servType) {
		this.servType = servType;
	}

}
