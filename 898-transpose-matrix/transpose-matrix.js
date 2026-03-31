/**
 * @param {number[][]} matrix
 * @return {number[][]}
 */
var transpose = function(matrix) {
        const n=matrix.length;
        const m=matrix[0].length;
        let result=[];
        for(let i=0; i<m; i++){
            result[i]=[];
            for(let j=0; j<n; j++){
                result[i][j]=matrix[j][i];
            }
        }
        return result;
};