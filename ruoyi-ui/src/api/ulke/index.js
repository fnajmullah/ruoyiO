import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listUlke(query) {
  return request({
    url: '/system/ulke/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getUlke(ulkeId) {
  return request({
    url: '/system/ulke/' + ulkeId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addUlke(data) {
  return request({
    url: '/system/ulke',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateUlke(data) {
  return request({
    url: '/system/ulke',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delUlke(ulkeId) {
  return request({
    url: '/system/ulke/' + ulkeId,
    method: 'delete'
  })
}

// 导出【请填写功能名称】
export function exportUlke(query) {
  return request({
    url: '/system/ulke/export',
    method: 'get',
    params: query
  })
}