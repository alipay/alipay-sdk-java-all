package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 一脸通行配置查询结果
 *
 * @author auto create
 * @since 1.0, 2022-01-13 16:40:10
 */
public class SceneConfigQueryDTO extends AlipayObject {

	private static final long serialVersionUID = 1157545545563522678L;

	/**
	 * 经营范围
	 */
	@ApiListField("business_scene")
	@ApiField("string")
	private List<String> businessScene;

	/**
	 * 人脸库id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 服务商中文名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 收款商户pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 学校内标
	 */
	@ApiField("school_id")
	private String schoolId;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 学校外标
	 */
	@ApiField("school_std_code")
	private String schoolStdCode;

	/**
	 * 签约小程序appId
	 */
	@ApiField("sign_app_id")
	private String signAppId;

	/**
	 * 状态，审核中AUDITING/已生效VALID
	 */
	@ApiField("status")
	private String status;

	public List<String> getBusinessScene() {
		return this.businessScene;
	}
	public void setBusinessScene(List<String> businessScene) {
		this.businessScene = businessScene;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolStdCode() {
		return this.schoolStdCode;
	}
	public void setSchoolStdCode(String schoolStdCode) {
		this.schoolStdCode = schoolStdCode;
	}

	public String getSignAppId() {
		return this.signAppId;
	}
	public void setSignAppId(String signAppId) {
		this.signAppId = signAppId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
