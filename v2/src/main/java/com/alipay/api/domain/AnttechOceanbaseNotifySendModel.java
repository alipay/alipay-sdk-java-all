package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * OB业务发送通知
 *
 * @author auto create
 * @since 1.0, 2023-09-13 14:57:27
 */
public class AnttechOceanbaseNotifySendModel extends AlipayObject {

	private static final long serialVersionUID = 6617785781296566739L;

	/**
	 * 用户通行证id
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 通知枚举:CLOUD_DELETE_CLUSTER_FAILED多云删除集群失败。
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 模板占位符信息列表
	 */
	@ApiListField("template_placeholder_list")
	@ApiField("template_placeholder_d_t_o")
	private List<TemplatePlaceholderDTO> templatePlaceholderList;

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public List<TemplatePlaceholderDTO> getTemplatePlaceholderList() {
		return this.templatePlaceholderList;
	}
	public void setTemplatePlaceholderList(List<TemplatePlaceholderDTO> templatePlaceholderList) {
		this.templatePlaceholderList = templatePlaceholderList;
	}

}
