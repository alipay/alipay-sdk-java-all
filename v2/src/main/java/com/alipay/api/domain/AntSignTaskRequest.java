package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签署子任务信息
 *
 * @author auto create
 * @since 1.0, 2023-05-15 09:39:05
 */
public class AntSignTaskRequest extends AlipayObject {

	private static final long serialVersionUID = 6124745141444364542L;

	/**
	 * 待签署文件列表
	 */
	@ApiListField("ant_sign_file_request_list")
	@ApiField("ant_sign_file_request")
	private List<AntSignFileRequest> antSignFileRequestList;

	/**
	 * 签署人信息
	 */
	@ApiListField("ant_sign_user_info_request_list")
	@ApiField("ant_sign_user_info_request")
	private List<AntSignUserInfoRequest> antSignUserInfoRequestList;

	/**
	 * 任务描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 是否关联业务，默认：false
	 */
	@ApiField("related_business")
	private Boolean relatedBusiness;

	/**
	 * 子业务流水号
	 */
	@ApiField("sub_biz_no")
	private String subBizNo;

	public List<AntSignFileRequest> getAntSignFileRequestList() {
		return this.antSignFileRequestList;
	}
	public void setAntSignFileRequestList(List<AntSignFileRequest> antSignFileRequestList) {
		this.antSignFileRequestList = antSignFileRequestList;
	}

	public List<AntSignUserInfoRequest> getAntSignUserInfoRequestList() {
		return this.antSignUserInfoRequestList;
	}
	public void setAntSignUserInfoRequestList(List<AntSignUserInfoRequest> antSignUserInfoRequestList) {
		this.antSignUserInfoRequestList = antSignUserInfoRequestList;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getRelatedBusiness() {
		return this.relatedBusiness;
	}
	public void setRelatedBusiness(Boolean relatedBusiness) {
		this.relatedBusiness = relatedBusiness;
	}

	public String getSubBizNo() {
		return this.subBizNo;
	}
	public void setSubBizNo(String subBizNo) {
		this.subBizNo = subBizNo;
	}

}
