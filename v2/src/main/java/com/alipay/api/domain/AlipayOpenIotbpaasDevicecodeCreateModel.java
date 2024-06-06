package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoTBPaaS一机一码生成
 *
 * @author auto create
 * @since 1.0, 2021-09-16 16:34:53
 */
public class AlipayOpenIotbpaasDevicecodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8888823313318352842L;

	/**
	 * 设备biztid
	 */
	@ApiField("biztid")
	private String biztid;

	/**
	 * 码类型为动态码/静态码，取值STATIC或DYNAMIC
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 设备物料ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 设备SN
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * IoT设备供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getBiztid() {
		return this.biztid;
	}
	public void setBiztid(String biztid) {
		this.biztid = biztid;
	}

	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
