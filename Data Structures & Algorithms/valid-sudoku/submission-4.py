class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for row in range(9):
            deck = set()
            for col in range(9):
                if board[row][col] == ".":
                    continue
                if board[row][col] in deck:
                    return False
                deck.add(board[row][col])
        
        for col in range(9):
            deck = set()
            for row in range(9):
                if board[row][col] == ".":
                    continue
                if board[row][col] in deck:
                    return False
                deck.add(board[row][col])
        
        square = collections.defaultdict(set)
        for row in range(9):
            for col in range(9):
                r = row // 3
                c = col // 3
                key = (r, c)
                if board[row][col] == ".":
                    continue
                if board[row][col] in square[key]:
                    return False
                square[key].add(board[row][col])
        
        return True