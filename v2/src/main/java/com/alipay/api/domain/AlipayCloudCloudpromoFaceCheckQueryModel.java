package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸信息校验查询
 *
 * @author auto create
 * @since 1.0, 2024-08-19 10:59:56
 */
public class AlipayCloudCloudpromoFaceCheckQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3882227572286818516L;

	/**
	 * 业务号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 商户自定义的用户Id。
	 */
	@ApiField("custom_id")
	private String customId;

	/**
	 * 环境参数
	 */
	@ApiField("env_data")
	private String envData;

	/**
	 * 人脸初始化信息
	 */
	@ApiField("face_check_init_resp")
	private FaceCheckInitResult faceCheckInitResp;

	/**
	 * 智能体实例id
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCustomId() {
		return this.customId;
	}
	public void setCustomId(String customId) {
		this.customId = customId;
	}

	public String getEnvData() {
		return this.envData;
	}
	public void setEnvData(String envData) {
		this.envData = envData;
	}

	public FaceCheckInitResult getFaceCheckInitResp() {
		return this.faceCheckInitResp;
	}
	public void setFaceCheckInitResp(FaceCheckInitResult faceCheckInitResp) {
		this.faceCheckInitResp = faceCheckInitResp;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
