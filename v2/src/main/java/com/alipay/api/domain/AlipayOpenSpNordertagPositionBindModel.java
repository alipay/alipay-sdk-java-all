package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 碰一下线圈绑定点位
 *
 * @author auto create
 * @since 1.0, 2025-07-30 03:11:18
 */
public class AlipayOpenSpNordertagPositionBindModel extends AlipayObject {

	private static final long serialVersionUID = 1569247396631978844L;

	/**
	 * 物料编号，若和碰一下链接同时传入，以物料编号为准
	 */
	@ApiListField("cloi_no")
	@ApiField("string")
	private List<String> cloiNo;

	/**
	 * 除物料编号外其他支持绑定的物料绑定参数，现支持碰一下链接绑定，都存在时已物料编号为绑定条件
	 */
	@ApiField("ext_param")
	private NOrderTagBindResp extParam;

	/**
	 * 进行的操作
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 点位唯一标识
	 */
	@ApiField("position_id")
	private String positionId;

	public List<String> getCloiNo() {
		return this.cloiNo;
	}
	public void setCloiNo(List<String> cloiNo) {
		this.cloiNo = cloiNo;
	}

	public NOrderTagBindResp getExtParam() {
		return this.extParam;
	}
	public void setExtParam(NOrderTagBindResp extParam) {
		this.extParam = extParam;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getPositionId() {
		return this.positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

}
