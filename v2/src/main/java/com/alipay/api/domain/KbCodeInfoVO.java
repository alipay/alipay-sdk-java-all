package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑码信息对象
 *
 * @author auto create
 * @since 1.0, 2017-04-14 10:36:36
 */
public class KbCodeInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4834612645619665942L;

	/**
	 * 创建口碑码的批次号
	 */
	@ApiField("batch_id")
	private Long batchId;

	/**
	 * 口碑码图片(不带背景图)
	 */
	@ApiField("code_url")
	private String codeUrl;

	/**
	 * 口碑码创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 口碑码ID
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 口碑码物料图（带背景）
	 */
	@ApiField("resource_url")
	private String resourceUrl;

	/**
	 * 口碑店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 口碑门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 物料模板
	 */
	@ApiField("stuff_template")
	private String stuffTemplate;

	/**
	 * 物料模板描述
	 */
	@ApiField("stuff_template_desc")
	private String stuffTemplateDesc;

	/**
	 * 口碑码类型描述
	 */
	@ApiField("stuff_type_desc")
	private String stuffTypeDesc;

	/**
	 * 桌号
	 */
	@ApiField("table_no")
	private String tableNo;

	public Long getBatchId() {
		return this.batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public String getCodeUrl() {
		return this.codeUrl;
	}
	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getResourceUrl() {
		return this.resourceUrl;
	}
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getStuffTemplate() {
		return this.stuffTemplate;
	}
	public void setStuffTemplate(String stuffTemplate) {
		this.stuffTemplate = stuffTemplate;
	}

	public String getStuffTemplateDesc() {
		return this.stuffTemplateDesc;
	}
	public void setStuffTemplateDesc(String stuffTemplateDesc) {
		this.stuffTemplateDesc = stuffTemplateDesc;
	}

	public String getStuffTypeDesc() {
		return this.stuffTypeDesc;
	}
	public void setStuffTypeDesc(String stuffTypeDesc) {
		this.stuffTypeDesc = stuffTypeDesc;
	}

	public String getTableNo() {
		return this.tableNo;
	}
	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

}
