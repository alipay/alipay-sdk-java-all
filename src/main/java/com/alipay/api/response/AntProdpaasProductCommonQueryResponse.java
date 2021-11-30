package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ProductBaseVO;
import com.alipay.api.domain.ProdIPRelationVO;
import com.alipay.api.domain.ProdLORelationVO;
import com.alipay.api.domain.ProdMarkRelationVO;
import com.alipay.api.domain.ProdRelationVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.product.common.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AntProdpaasProductCommonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3711417676414675113L;

	/** 
	 * 产品基本信息
	 */
	@ApiField("prod_base")
	private ProductBaseVO prodBase;

	/** 
	 * 产品条件信息。值为json结构,嵌套结构。normal代表普通条件，其他代表息费等复杂条件，key为条件别名，value为条件值.
	 */
	@ApiField("prod_condition")
	private String prodCondition;

	/** 
	 * 产品参与者关系列表
	 */
	@ApiListField("prod_ip_list")
	@ApiField("prod_i_p_relation_v_o")
	private List<ProdIPRelationVO> prodIpList;

	/** 
	 * 产品区域关联信息列表
	 */
	@ApiListField("prod_lo_list")
	@ApiField("prod_l_o_relation_v_o")
	private List<ProdLORelationVO> prodLoList;

	/** 
	 * 产品外标关系列表
	 */
	@ApiListField("prod_mark_list")
	@ApiField("prod_mark_relation_v_o")
	private List<ProdMarkRelationVO> prodMarkList;

	/** 
	 * 产品间关系列表
	 */
	@ApiListField("prod_rel_list")
	@ApiField("prod_relation_v_o")
	private List<ProdRelationVO> prodRelList;

	public void setProdBase(ProductBaseVO prodBase) {
		this.prodBase = prodBase;
	}
	public ProductBaseVO getProdBase( ) {
		return this.prodBase;
	}

	public void setProdCondition(String prodCondition) {
		this.prodCondition = prodCondition;
	}
	public String getProdCondition( ) {
		return this.prodCondition;
	}

	public void setProdIpList(List<ProdIPRelationVO> prodIpList) {
		this.prodIpList = prodIpList;
	}
	public List<ProdIPRelationVO> getProdIpList( ) {
		return this.prodIpList;
	}

	public void setProdLoList(List<ProdLORelationVO> prodLoList) {
		this.prodLoList = prodLoList;
	}
	public List<ProdLORelationVO> getProdLoList( ) {
		return this.prodLoList;
	}

	public void setProdMarkList(List<ProdMarkRelationVO> prodMarkList) {
		this.prodMarkList = prodMarkList;
	}
	public List<ProdMarkRelationVO> getProdMarkList( ) {
		return this.prodMarkList;
	}

	public void setProdRelList(List<ProdRelationVO> prodRelList) {
		this.prodRelList = prodRelList;
	}
	public List<ProdRelationVO> getProdRelList( ) {
		return this.prodRelList;
	}

}
