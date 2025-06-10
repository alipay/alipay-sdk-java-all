package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 碰一下线圈绑定点位
 *
 * @author auto create
 * @since 1.0, 2025-06-03 13:49:01
 */
public class AlipayOpenSpNordertagPositionBindModel extends AlipayObject {

	private static final long serialVersionUID = 5824348198132844691L;

	/**
	 * 线圈编号
	 */
	@ApiListField("cloi_no")
	@ApiField("string")
	private List<String> cloiNo;

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
