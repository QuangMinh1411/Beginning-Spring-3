package com.heaven.oath2.response;

public record SearchListResponse(String kind,String etag,String nextPageToken,String prevPageToken,PageInfo pageInfo,SearchResult[] items) {
}
