package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 展台准入类目
 *
 * @author auto create
 * @since 1.0, 2021-07-16 19:24:01
 */
public class PromoAccessBaseCatalogVO extends AlipayObject {

	private static final long serialVersionUID = 2668853969742375619L;

	/**
	 * 类目节点描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 类目节点名称
	 */
	@ApiField("node_name")
	private String nodeName;

	/**
	 * 类目节点ID
	 */
	@ApiField("nodei_d")
	private String nodeiD;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getNodeName() {
		return this.nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getNodeiD() {
		return this.nodeiD;
	}
	public void setNodeiD(String nodeiD) {
		this.nodeiD = nodeiD;
	}

}
