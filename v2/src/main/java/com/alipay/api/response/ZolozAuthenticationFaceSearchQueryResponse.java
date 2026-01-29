package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FaceSearchResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.face.search.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:08
 */
public class ZolozAuthenticationFaceSearchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6689297715421668229L;

	/** 
	 * 搜索到的人脸候选集
	 */
	@ApiListField("candidate_list")
	@ApiField("face_search_result")
	private List<FaceSearchResult> candidateList;

	/** 
	 * 人脸搜索找到的用户
	 */
	@ApiField("found_face")
	private FaceSearchResult foundFace;

	/** 
	 * 返回详细码
	 */
	@ApiField("ret_code_sub")
	private String retCodeSub;

	/** 
	 * 返回详细信息
	 */
	@ApiField("ret_message_sub")
	private String retMessageSub;

	public void setCandidateList(List<FaceSearchResult> candidateList) {
		this.candidateList = candidateList;
	}
	public List<FaceSearchResult> getCandidateList( ) {
		return this.candidateList;
	}

	public void setFoundFace(FaceSearchResult foundFace) {
		this.foundFace = foundFace;
	}
	public FaceSearchResult getFoundFace( ) {
		return this.foundFace;
	}

	public void setRetCodeSub(String retCodeSub) {
		this.retCodeSub = retCodeSub;
	}
	public String getRetCodeSub( ) {
		return this.retCodeSub;
	}

	public void setRetMessageSub(String retMessageSub) {
		this.retMessageSub = retMessageSub;
	}
	public String getRetMessageSub( ) {
		return this.retMessageSub;
	}

}
