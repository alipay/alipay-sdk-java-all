package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提交企业消息推送任务
 *
 * @author auto create
 * @since 1.0, 2024-09-18 11:03:03
 */
public class AlipayCommerceEcMsgTaskSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8673398824252394479L;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 消息场景列表
	 */
	@ApiListField("msg_scene_list")
	@ApiField("msg_scene_d_t_o")
	private List<MsgSceneDTO> msgSceneList;

	/**
	 * 企业生成的请求唯一流水号/业务幂等号；
字段作用：
1. 作为提交消息任务的幂等标识，使用相同的out_biz_no 会返回相同的任务id列表
2. 若调用失败或超时，可以使用相同的 out_biz_no 进行幂等重试
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public List<MsgSceneDTO> getMsgSceneList() {
		return this.msgSceneList;
	}
	public void setMsgSceneList(List<MsgSceneDTO> msgSceneList) {
		this.msgSceneList = msgSceneList;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
