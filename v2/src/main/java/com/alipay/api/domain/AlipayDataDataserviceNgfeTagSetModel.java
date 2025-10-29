package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 非淘系业务写入图灵实时标签
 *
 * @author auto create
 * @since 1.0, 2025-09-18 16:08:15
 */
public class AlipayDataDataserviceNgfeTagSetModel extends AlipayObject {

	private static final long serialVersionUID = 2692914349999123513L;

	/**
	 * 标签写入应用，用于鉴权, 业务方按实际填写
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 如线下支付交易单号
	 */
	@ApiField("idempotent_id")
	private String idempotentId;

	/**
	 * 一级域名称，固定传NgfeL1Domain
	 */
	@ApiField("l_1_domain_code")
	private String l1DomainCode;

	/**
	 * 二级域名称，固定传NgfeL1DomainL2
	 */
	@ApiField("l_2_domain_code")
	private String l2DomainCode;

	/**
	 * 用于传入标签更新的扩展信息，例如传入二维实体ID。
key："slave_objId", value:"xxx"
	 */
	@ApiListField("label_update_ext_info_list")
	@ApiField("label_update_ext_info")
	private List<LabelUpdateExtInfo> labelUpdateExtInfoList;

	/**
	 * 待更新的标签列表
	 */
	@ApiListField("label_update_model_list")
	@ApiField("label_update_detail")
	private List<LabelUpdateDetail> labelUpdateModelList;

	/**
	 * 标签实体ID
	 */
	@ApiField("object_id")
	private String objectId;

	/**
	 * 标签实体ID
	 */
	@ApiField("object_open_id")
	private String objectOpenId;

	/**
	 * 用于流量统计
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 用于标识通过哪个渠道写入的标签
	 */
	@ApiField("source")
	private String source;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getIdempotentId() {
		return this.idempotentId;
	}
	public void setIdempotentId(String idempotentId) {
		this.idempotentId = idempotentId;
	}

	public String getL1DomainCode() {
		return this.l1DomainCode;
	}
	public void setL1DomainCode(String l1DomainCode) {
		this.l1DomainCode = l1DomainCode;
	}

	public String getL2DomainCode() {
		return this.l2DomainCode;
	}
	public void setL2DomainCode(String l2DomainCode) {
		this.l2DomainCode = l2DomainCode;
	}

	public List<LabelUpdateExtInfo> getLabelUpdateExtInfoList() {
		return this.labelUpdateExtInfoList;
	}
	public void setLabelUpdateExtInfoList(List<LabelUpdateExtInfo> labelUpdateExtInfoList) {
		this.labelUpdateExtInfoList = labelUpdateExtInfoList;
	}

	public List<LabelUpdateDetail> getLabelUpdateModelList() {
		return this.labelUpdateModelList;
	}
	public void setLabelUpdateModelList(List<LabelUpdateDetail> labelUpdateModelList) {
		this.labelUpdateModelList = labelUpdateModelList;
	}

	public String getObjectId() {
		return this.objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getObjectOpenId() {
		return this.objectOpenId;
	}
	public void setObjectOpenId(String objectOpenId) {
		this.objectOpenId = objectOpenId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
