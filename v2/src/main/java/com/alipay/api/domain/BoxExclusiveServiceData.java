package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务详情
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:02:10
 */
public class BoxExclusiveServiceData extends AlipayObject {

	private static final long serialVersionUID = 1189411644461788756L;

	/**
	 * 2020012321000607972103
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

}
