package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加蚂蚁操作员
 *
 * @author auto create
 * @since 1.0, 2022-10-27 17:38:48
 */
public class AlipayOpenAuthOperatorAddModel extends AlipayObject {

	private static final long serialVersionUID = 5497944733692914876L;

	/**
	 * 添加蚂蚁操作员参数
	 */
	@ApiField("operator_add_vo")
	private OperatorAddVO operatorAddVo;

	public OperatorAddVO getOperatorAddVo() {
		return this.operatorAddVo;
	}
	public void setOperatorAddVo(OperatorAddVO operatorAddVo) {
		this.operatorAddVo = operatorAddVo;
	}

}
