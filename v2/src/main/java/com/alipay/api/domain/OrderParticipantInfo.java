package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 参与者信息
 *
 * @author auto create
 * @since 1.0, 2021-08-30 10:48:18
 */
public class OrderParticipantInfo extends AlipayObject {

	private static final long serialVersionUID = 2344657553653361486L;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 参与方logo素材id
开发者通过 alipay.merchant.item.file.upload(商品文件上传接口)上传图片，获取到对应的素材 ID( material_id )
	 */
	@ApiField("logo_material_id")
	private String logoMaterialId;

	/**
	 * 参与方名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 参与方简称
	 */
	@ApiField("short_name")
	private String shortName;

	/**
	 * 参与方类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 参与方支付宝uid
	 */
	@ApiField("uid")
	private String uid;

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getLogoMaterialId() {
		return this.logoMaterialId;
	}
	public void setLogoMaterialId(String logoMaterialId) {
		this.logoMaterialId = logoMaterialId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return this.shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
