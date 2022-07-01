package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 儿童账户咨询
 *
 * @author auto create
 * @since 1.0, 2020-01-07 11:03:58
 */
public class AlipayCommerceKidsAccountConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7777434877986168667L;

	/**
	 * 与child_cert_type对应，如果child_cert_type为IDENTITY_CARD，对应的取值为身份证号
	 */
	@ApiField("child_cert_no")
	private String childCertNo;

	/**
	 * 证件类型，暂时只支持身份证
	 */
	@ApiField("child_cert_type")
	private String childCertType;

	/**
	 * 信息来源，用于指定一个小宝账户
	 */
	@ApiField("info_source")
	private InfoSource infoSource;

	/**
	 * 当前操作者支付宝userId
	 */
	@ApiField("operator_uid")
	private String operatorUid;

	/**
	 * 家长支付宝userId，用于查询与该家长关联的孩子
	 */
	@ApiField("parent_uid")
	private String parentUid;

	/**
	 * 场景码，接入前需要进行申请
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getChildCertNo() {
		return this.childCertNo;
	}
	public void setChildCertNo(String childCertNo) {
		this.childCertNo = childCertNo;
	}

	public String getChildCertType() {
		return this.childCertType;
	}
	public void setChildCertType(String childCertType) {
		this.childCertType = childCertType;
	}

	public InfoSource getInfoSource() {
		return this.infoSource;
	}
	public void setInfoSource(InfoSource infoSource) {
		this.infoSource = infoSource;
	}

	public String getOperatorUid() {
		return this.operatorUid;
	}
	public void setOperatorUid(String operatorUid) {
		this.operatorUid = operatorUid;
	}

	public String getParentUid() {
		return this.parentUid;
	}
	public void setParentUid(String parentUid) {
		this.parentUid = parentUid;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
