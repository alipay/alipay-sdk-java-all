package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业社区业主信息
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:19:02
 */
public class CplifeResidentInfo extends AlipayObject {

	private static final long serialVersionUID = 7365368657726897315L;

	/**
	 * 业主关联的房产在支付宝平台中的唯一标识。(该属性和property_entity_id两个至少需要填写一项，如果两项都填写则以entity_id为准.)
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 业主身份证号的MD5结果
	 */
	@ApiField("idcard_no")
	private String idcardNo;

	/**
	 * 用户的真实姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 业主关联的房产在物业系统中的唯一标识。(该属性和entity_id两个至少需要填写一项，如果两项都填写则以entity_id为准.)
	 */
	@ApiField("out_entity_id")
	private String outEntityId;

	/**
	 * 物业系统中小区住户的唯一ID标识.
	 */
	@ApiField("out_resident_id")
	private String outResidentId;

	/**
	 * 用户对房产的关系类型。业主:1；家人:2；租客:3
	 */
	@ApiField("type")
	private String type;

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getIdcardNo() {
		return this.idcardNo;
	}
	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutEntityId() {
		return this.outEntityId;
	}
	public void setOutEntityId(String outEntityId) {
		this.outEntityId = outEntityId;
	}

	public String getOutResidentId() {
		return this.outResidentId;
	}
	public void setOutResidentId(String outResidentId) {
		this.outResidentId = outResidentId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
