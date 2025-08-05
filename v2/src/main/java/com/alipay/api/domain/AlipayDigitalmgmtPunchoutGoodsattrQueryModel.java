package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通过类目获取商品价格信息
 *
 * @author auto create
 * @since 1.0, 2025-07-01 11:46:41
 */
public class AlipayDigitalmgmtPunchoutGoodsattrQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2118454219616788861L;

	/**
	 * 属性值集合，包含属性Id属性名称，属性值Id。属性值名称
	 */
	@ApiListField("attr_value_list")
	@ApiField("mall_attr_value")
	private List<MallAttrValue> attrValueList;

	/**
	 * 是否查询有效数据，默认查询有效数据
	 */
	@ApiField("is_valid")
	private String isValid;

	/**
	 * 查询数据的当前页数据，入参1 查询第1页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 查询到的数据最大返回值,传参50 最多只返回50条数据
	 */
	@ApiField("page_size")
	private Long pageSize;

	public List<MallAttrValue> getAttrValueList() {
		return this.attrValueList;
	}
	public void setAttrValueList(List<MallAttrValue> attrValueList) {
		this.attrValueList = attrValueList;
	}

	public String getIsValid() {
		return this.isValid;
	}
	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
