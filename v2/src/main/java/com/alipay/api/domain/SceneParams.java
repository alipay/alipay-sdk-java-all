package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景参数模型
 *
 * @author auto create
 * @since 1.0, 2023-08-29 15:56:22
 */
public class SceneParams extends AlipayObject {

	private static final long serialVersionUID = 5113622312785581167L;

	/**
	 * 人脸接入必传，身份核验授权authFlag，R仅授权人脸认证结果，A为认证结果和人脸图像
	 */
	@ApiField("auth_flag")
	private String authFlag;

	/**
	 * 核身完成后的回调类型枚举
	 */
	@ApiField("call_back_action_code")
	private String callBackActionCode;

	/**
	 * 环境参数，获取的客户端环境信息（仅对人脸、指纹等依赖设备硬件的核身方式）。客户端通过jsapi获取    ant.call('verifyIdentity', {
      action: 'getEnvData', 
  		actionInfo: '',
    }, function (result) {
       console.log(result.actionResult);
    });
	 */
	@ApiField("env_data")
	private String envData;

	/**
	 * 渲染形态，native或h5
	 */
	@ApiField("render_group")
	private String renderGroup;

	public String getAuthFlag() {
		return this.authFlag;
	}
	public void setAuthFlag(String authFlag) {
		this.authFlag = authFlag;
	}

	public String getCallBackActionCode() {
		return this.callBackActionCode;
	}
	public void setCallBackActionCode(String callBackActionCode) {
		this.callBackActionCode = callBackActionCode;
	}

	public String getEnvData() {
		return this.envData;
	}
	public void setEnvData(String envData) {
		this.envData = envData;
	}

	public String getRenderGroup() {
		return this.renderGroup;
	}
	public void setRenderGroup(String renderGroup) {
		this.renderGroup = renderGroup;
	}

}
