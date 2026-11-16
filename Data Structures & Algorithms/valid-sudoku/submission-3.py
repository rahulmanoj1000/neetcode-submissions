class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for col in range(9):
            deck = set()
            for row in range(9):
                if board[row][col] in deck:
                    return False
                if board[row][col] == '.':
                    continue
                deck.add(board[row][col])

        for row in range(9):
            deck = set()
            for col in range(9):
                if board[row][col] in deck:
                    return False
                if board[row][col] == '.':
                    continue
                deck.add(board[row][col])

        square = collections.defaultdict(set)
        for i in range(9):
            for j in range(9):
                col = j // 3
                row = i // 3
                key = (row, col)
                if board[i][j] == '.':
                    continue
                if(board[i][j] in square[key]):
                    return False
                else:
                     square[key].add(board[i][j])
        
        return True
                