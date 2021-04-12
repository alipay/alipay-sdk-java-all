package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * SubTestDesensitiveTwo
 *
 * @author auto create
 * @since 1.0, 2021-04-09 17:21:01
 */
public class SubTestDesensitiveTwo extends AlipayObject {

	private static final long serialVersionUID = 6831841536365273417L;

	/**
	 * 11
	 */
	@ApiField("address")
	private String address;

	/**
	 * ["地址1","地址2","地址3"]
	 */
	@ApiListField("address_list")
	@ApiField("string")
	private List<String> addressList;

	/**
	 * 11
	 */
	@ApiField("cert")
	private String cert;

	/**
	 * 卡号列表
	 */
	@ApiListField("cert_list")
	@ApiField("string")
	private List<String> certList;

	/**
	 * 1
	 */
	@ApiField("contury")
	private String contury;

	/**
	 * 1
	 */
	@ApiField("contury_list")
	private String conturyList;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getAddressList() {
		return this.addressList;
	}
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public String getCert() {
		return this.cert;
	}
	public void setCert(String cert) {
		this.cert = cert;
	}

	public List<String> getCertList() {
		return this.certList;
	}
	public void setCertList(List<String> certList) {
		this.certList = certList;
	}

	public String getContury() {
		return this.contury;
	}
	public void setContury(String contury) {
		this.contury = contury;
	}

	public String getConturyList() {
		return this.conturyList;
	}
	public void setConturyList(String conturyList) {
		this.conturyList = conturyList;
	}

}
