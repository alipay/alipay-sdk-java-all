package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量申请凭证
 *
 * @author auto create
 * @since 1.0, 2023-08-24 13:51:13
 */
public class AlipayOverseasOpenIndrreceiptApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7236369598199267176L;

	/**
	 * 凭证申请参数列表
	 */
	@ApiListField("apply_receipt_list")
	@ApiField("indr_i_s_v_receipt_apply_d_t_o")
	private List<IndrISVReceiptApplyDTO> applyReceiptList;

	/**
	 * C2B业务场景枚举值，HOUSE_RENTAL租房场景，TUITION留学场景
	 */
	@ApiField("scene_type")
	private String sceneType;

	public List<IndrISVReceiptApplyDTO> getApplyReceiptList() {
		return this.applyReceiptList;
	}
	public void setApplyReceiptList(List<IndrISVReceiptApplyDTO> applyReceiptList) {
		this.applyReceiptList = applyReceiptList;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
